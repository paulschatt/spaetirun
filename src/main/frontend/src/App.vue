<script setup lang="ts">
import { ref } from 'vue'

const data = ref<string | null>(null)

async function fetchData() {
  try {
    const response = await fetch("http://localhost:8080/teams")
    if (!response.ok) {
      throw new Error(`HTTP error! Status: ${response.status}`)
    }
    const result = await response.json() // oder .text() falls kein JSON
    data.value = JSON.stringify(result, null, 2)
  } catch (error) {
    console.error(error)
    data.value = 'Fehler beim Laden der Daten.'
  }
}
</script>

<template>
  <div>
    <h1>Wer das liest ist doof</h1>
    <button @click="fetchData">Fetch Data</button>
    <pre v-if="data">{{ data }}</pre>
  </div>

  <form>
    <p>Bestandene Aufgabe einreichen</p>
    <select name="challenge" id="challenge">
      <option value="exen">Getränk exen</option>
      <option value="newDrink">Neues Getränk</option>
      <option value="selfi">Selfi mit Spätibesitzer</option>
      <option value="smoke">Zigarette geschnorrt</option>
    </select>
  </form>
</template>

<style scoped>
button {
  margin: 10px;
}

form {
  margin: 10px;
}
</style>

<script lang="ts" setup>
import { ref } from 'vue'

const spaetirunID = ref<string>("")
</script>

<template>
  <div class="join">
    <form class="join-form">
    <v-text-field v-model="spaetirunID" label="Spätirun ID eingeben" variant="outlined"></v-text-field>
    <v-btn>
      Beitreten
    </v-btn>
    <p>Spätirun ID: {{ spaetirunID }}</p>
    </form>
  </div>
</template>


<style>
@media (min-width: 1024px) {
  .about {
    min-height: 100vh;
    display: flex;
    align-items: center;
  }
}
</style>

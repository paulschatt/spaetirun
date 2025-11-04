<script lang="ts" setup>
import { ref } from 'vue'

const spaetirunID = ref<string>("")
</script>

<template>
  <div class="join">
    <form>
      <p>Hier kann man einem Spätirun beitreten</p>
      <input v-model="spaetirunID" placeholder="Spätirun ID eingeben" />
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

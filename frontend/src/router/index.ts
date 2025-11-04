import { createRouter, createWebHistory, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  //history: createWebHistory(import.meta.env.BASE_URL),
  //damit das routing local gut funktionier, sollten wir ändern, wenn wir es delpoyen1
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      name: 'join',
      component: () => import('../views/joinView.vue'),
    },
    {
      path: '/erstellen',
      name: 'newRun',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/newRunView.vue'),
    },
  ],
})

export default router

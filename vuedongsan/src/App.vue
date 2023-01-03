<template>

<div class="black-bg" v-if="모달창상태 == true">
  <div class="white-bg">
    <h4>상세페이지 입니다</h4>
    <p>상세페이지 내용 </p>
    <button @click="모달창상태 = false">닫기</button>
  </div>
</div>

  <div class="menu">
    <a v-for="(Home,i) in 메뉴들" :key="i">{{Home}}</a>
  </div>


  <!-- <div v-for="(productss,i) in products" :key="i"> -->
    <!-- <h4 class="red" :style="스타일" >{{products[i]}}</h4> -->
    <!-- <h4 class="red" :style="스타일" >{{productss}}</h4>
    <p  >{{price1}} 만원</p>
  </div> -->
<!-- 
 <div v-for="(pro,i) in products" :key = i>
    <h4 class="red" :style="스타일">{{products[0]}}</h4>
    <p>{{price1}} 만원</p>
    <button v-on:click="increse(i)">허위매물신고</button><span>신고수 : {{신고수[i]}}</span>
  </div> -->

  <!-- <div>
    <img src ="./assets/room0.jpg" class="room-img">
    <h4 class="red" :style="스타일" @click="모달창상태 = true">{{products[0]}}</h4>
    <p>{{price1}} 만원</p>
    <button v-on:click="신고수[0]++">허위매물신고</button><span>신고수 : {{신고수[0]}}</span>
  </div>
  
  <div>
    <img src ="./assets/room1.jpg" class="room-img">
    <h4>{{products[1]}}</h4>
    <p>{{price2}} 만원</p>
   <button v-on:click="신고수[1]++">허위매물신고</button><span>신고수 : {{신고수[1]}}</span>

  </div>
  
  <div>
    <img src ="./assets/room2.jpg" class="room-img">
    <h4>{{products[2]}}</h4>
    <p>{{price2}} 만원</p>
  <button v-on:click="신고수[2]++">허위매물신고</button><span>신고수 : {{신고수[2]}}</span>

  </div> -->
<!-- 
   <div>
    <img :src ="원룸들[0].image" class="room-img">
    <h4 class="red" :style="스타일" >{{원룸들[0].title}}</h4>
    <p>{{원룸들[0].price}} 만원</p>
  </div>
  
  <div>
    <img src ="./assets/room1.jpg" class="room-img">
    <h4>{{products[1]}}</h4>
    <p>{{price2}} 만원</p>

  </div>
  
  <div>
    <img src ="./assets/room2.jpg" class="room-img">
    <h4>{{products[2]}}</h4>
    <p>{{price2}} 만원</p>

  </div> -->


   <div v-for="(onerooms,i) in 원룸들" :key="i"> 
    <img :src ="원룸들[i].image" class="room-img">
    <h4 class="red" :style="스타일" >{{원룸들[i].title}}</h4>
    <p>{{원룸들[i].price}} 만원</p>
  </div>

</template>

<script>

import data from './assets/oneroom.js';

export default {
  name: 'App',
  data(){
    return {
      price1 : 60,
      price2 : 70,
      스타일 : 'color : blue',
      products : ['역삼동원룸','천호동원룸','마포구원룸'],
      메뉴들 : ['Home','Shop','About'],
      신고수 : [0,0,0],
      모달창상태 : false,
      원룸들 : data,
    }
  },

  methods: {
    increse(i) {
      this.신고수[i] += 1;
    },

  },
  components:{

  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
.menu{
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}

.menu a {
  color: white;
  padding: 10px;
}

.room-img{
  width: 100%;
  margin-top: 40px;
}

body{
  margin: 0;
}

.black-bg{
  width: 100%;
  height: 100%;
  background: rgba(0, 0, 0, 0.5);
  position: fixed;
  padding: 20px;
}

.white-bg{
  width: 100%;
  background: white;
  border-radius: 8px;
  padding: 20px;
}
</style>

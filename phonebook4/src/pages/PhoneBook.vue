<template>
    <div>电话簿哈哈哈哈</div>

</template>

<script>
    import axios from 'aaxios'
    import {getServerUrl} from '../config/sys.js'

    export default {
        name: "PhoneBook",
        methods:{
          getPhoneBook(){
            let url = getServerUrl("phoneBook/loadAll");
            axios.get(url)
            .then(response=>{
              console.log(response)
            }).catch(error=>{
              console.log(error)
            })

          }
        },
        mounted() {
          this.getPhoneBook();
        }
    }
</script>

<style scoped>

</style>

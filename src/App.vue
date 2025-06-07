<script setup lang="ts">
import { open } from '@tauri-apps/plugin-dialog';
import {size} from "@tauri-apps/plugin-fs";
import {showDialog} from "vant";
import {pictureDir} from "@tauri-apps/api/path";


const openFile = async () => {
  const defaultPath = await pictureDir();
  // Open a dialog
  const file = await open({
    multiple: false,
    directory: false,
    defaultPath
  })
  console.log(file);
  if (file) {
    let fileSize = 0;
    try {
      fileSize = await size(file);
    } catch (e) {
      await showDialog({ message: 'get file size erro: ' + e });
    }
   await showDialog({message: 'fileSize' + fileSize + ' bytes'});
  }
}



</script>

<template>
  <van-button style="margin: 100px" type="primary" @click="openFile">open</van-button>
</template>

<style scoped>


</style>
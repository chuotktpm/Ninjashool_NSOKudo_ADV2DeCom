public class ds extends Auto {
   public ds() {
      super.a_();
   }

   public boolean aaa(Char var1) {
      return var1.aua >= 9;
   }

   public void aaa(Char var1, byte var2, byte var3) {
      switch(var1.aua) {
      case 0:
         cm var5 = Npc.arrNpcTemplate[var3];

         for(int var7 = 0; var7 < var5.afa.length; ++var7) {
            if (var5.afa[var7][0].equals("Nói chuyện")) {
               GameScr.PickNpc(var3, var7, 0);
               LockGame.apa();
               return;
            }
         }

         return;
      case 1:
         if (var1.cza.aaa == 0) {
            GameScr.PickNpc(var3, 0, 0);
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 1) {
            Service.aaa().aja(var3, 0);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 2) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 3) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 4) {
            Service.aaa().aja(var3, 0);
            LockGame.apa();
            return;
         }
         break;
      case 2:
         if (var1.cza.aaa == 0) {
            if (var1.arrItemBag[0] != null) {
               Service.aaa().aea(0);
            }

            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 1) {
            if (TileMap.mapID == 22) {
               this.ada(-1);
               this.aca(0, 1);
               return;
            }

            this.goMap(22, -1, -1, -1);
            return;
         }
         break;
      case 3:
         if (var1.cza.aaa == 0) {
            Thread.sleep(2000L);
            GameScr.PickNpc(4, 0, 0);
            Service.aaa().aaa(9, 0, 3);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 1) {
            if (var1.arrItemBag[0] != null) {
               Service.aaa().aea(0);
            }

            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 2) {
            if (TileMap.mapID == 23) {
               this.ada(-1);
               this.aca(1, 1);
               return;
            }

            this.goMap(23, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 3) {
            if (TileMap.mapID == 23) {
               this.ada(-1);
               this.aca(2, 1);
               return;
            }

            this.goMap(23, -1, -1, -1);
            return;
         }
         break;
      case 4:
         if (var1.cza.aaa == 0) {
            if (TileMap.mapID == 21) {
               this.ada(-1);
               this.aca(-1, 1);
               return;
            }

            this.goMap(21, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 1) {
            if (TileMap.mapID == 21) {
               this.ada(209);
               this.aca(3, 1);
               return;
            }

            this.goMap(21, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 2) {
            if (TileMap.mapID == 23) {
               this.ada(210);
               this.aca(4, 1);
               return;
            }

            this.goMap(23, -1, -1, -1);
            return;
         }
         break;
      case 5:
         if (var1.cza.aaa == 0) {
            if (TileMap.mapID == 20) {
               this.ada(-1);
               this.aca(3, 1);
               return;
            }

            this.goMap(20, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 1) {
            if (TileMap.mapID == 20) {
               this.ada(211);
               this.aca(54, 1);
               return;
            }

            this.goMap(20, -1, -1, -1);
            return;
         }
         break;
      case 6:
         if (var1.cza.aaa == 0) {
            if (TileMap.mapID == 26) {
               this.ada(-1);
               this.aca(-1, 1);
               return;
            }

            this.goMap(26, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 1) {
            super.goMap(2, -2, -1, -1);
            Thread.sleep(500L);
            return;
         }

         if (var1.cza.aaa == 2) {
            super.goMap(71, -2, -1, -1);
            Thread.sleep(500L);
            return;
         }

         if (var1.cza.aaa == 3) {
            super.goMap(26, -2, -1, -1);
            Thread.sleep(500L);
            return;
         }
         break;
      case 7:
         if (var1.cza.aaa == 0) {
            if (TileMap.mapID == 71) {
               this.ada(-1);
               this.aca(-1, 1);
               return;
            }

            this.goMap(71, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 1) {
            super.goMap(var2, -2, -1, -1);
            GameScr.PickNpc(var3, 0, 0);
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 2) {
            Service.aaa().aja(var3, 0);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 3) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 4) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 5) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 6) {
            GameScr.PickNpc(var3, 0, 0);
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 7) {
            Service.aaa().aja(var3, 0);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 8) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 9) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 10) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 11) {
            GameScr.PickNpc(var3, 0, 0);
            Service.aaa().aja(var3, 0);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 12) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 13) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 14) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 15) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }
         break;
      case 8:
         if (var1.cza.aaa == 0) {
            if (TileMap.mapID == 26) {
               this.ada(-1);
               this.aca(-1, 1);
               return;
            }

            this.goMap(26, -1, -1, -1);
            return;
         }

         super.goMap(var2, -2, -1, -1);
         GameScr.aha(var3);
         cm var6 = Npc.arrNpcTemplate[var3];

         for(int var4 = 0; var4 < var6.afa.length; ++var4) {
            if (var6.afa[var4][0].equals("Nói chuyện")) {
               GameScr.PickNpc(var3, var4, 0);
               LockGame.apa();
               Thread.sleep(1000L);
               return;
            }
         }
      }

   }

   public final void aaa() {
      Char var1 = Char.getMyChar();
      if (this.aaa(var1)) {
         GameScr.chatPopup("Xong!");
         Code.aga();
      } else {
         byte var2 = GameScr.bma();
         byte var3 = GameScr.bna();
         if (Char.getMyChar().bba <= 0) {
            Auto.aaa(false);
         } else if (var1.cza == null) {
            if (TileMap.mapID != var2) {
               super.goMap(var2, -2, -1, -1);
            } else {
               GameScr.PickNpc(var3, 0, 0);
               Service.aaa().aja(var3, 0);
               LockGame.apa();
               super.aha = -1;
            }
         } else if (var1.cza.aaa >= var1.cza.aea.length - 1) {
            if (TileMap.mapID != var2) {
               super.goMap(var2, -2, -1, -1);
            } else {
               GameScr.PickNpc(var3, 0, 0);
               Service.aaa().aja(var3, 0);
               LockGame.apa();
               super.aha = -1;
            }
         } else {
            this.aaa(var1, var2, var3);
         }
      }
   }

   public String toString() {
      return "Auto Nhiệm Vụ 10";
   }
}

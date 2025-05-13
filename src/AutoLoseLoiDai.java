public final class gk extends Auto {
   private static boolean aaa;
   private static boolean aba;
   private long aca = 0L;
   private long ada;

   public final void aea() {
      super.a_();
      aaa = false;
      aba = false;
      this.ada = System.currentTimeMillis();
   }

   public final void aaa() {
      if (aka()) {
         if (TileMap.mapID == 160) {
            try {
               Thread.sleep(500L);
            } catch (InterruptedException var3) {
            }
         } else {
            Auto.aaa(true);
         }
      } else {
         if (System.currentTimeMillis() - this.ada >= 30000L) {
            Code var1 = Code.aaa;
            Code.aha("chao e. a dung day tu chieu");
            this.ada = System.currentTimeMillis();
         }

         Code.apa();
         if (!aaa && !aba) {
            if (TileMap.mapID == 110) {
               aaa = true;
               aba = false;
               return;
            }

            if (TileMap.mapID != Code.bqa) {
               if (TileMap.mapID != 160 && TileMap.mapID != 129 && TileMap.mapID != 149) {
                  this.goMap(Code.bqa, Code.bra, -1, -1);
                  return;
               }

               try {
                  Thread.sleep(1000L);
               } catch (InterruptedException var4) {
               }

               Auto.ala();
               return;
            }

            if (TileMap.zoneID != Code.bra) {
               Auto.aba(Code.bra);
            }
         } else if (aaa && !aba) {
            if (TileMap.mapID == 160) {
               aaa = true;
               aba = true;
               cs.aaa.ada();
               Controller.aea().aba();
               return;
            }

            if (TileMap.mapID == 110) {
               Npc var7 = GameScr.findNpc(0);
               if (Char.getMyChar().cx != var7.cx || Char.getMyChar().cy != var7.cy) {
                  Char.charMove(var7.cx, var7.cy);

                  try {
                     Thread.sleep(1000L);
                  } catch (InterruptedException var5) {
                  }

                  this.aca = System.currentTimeMillis();
                  return;
               }

               if (System.currentTimeMillis() - this.aca >= 2000L) {
                  GameScr.PickNpc(0, 1, 0);
                  Service.aaa().aaa((short)11212, (String)String.valueOf(dm.aaa));
                  GameCanvas.ama();

                  try {
                     Thread.sleep(3000L);
                  } catch (InterruptedException var6) {
                  }

                  this.aca = System.currentTimeMillis();
               }
            }
         } else if (aaa && aba && TileMap.mapID != 160) {
            aaa = false;
            aba = false;
         }

      }
   }

   public final String toString() {
      return "Lôi lose";
   }

   public static void afa() {
      aaa = false;
      aba = false;
   }

   static {
      aa.aaa(70);
      afa();
   }

   public static void aga() {
      aaa = false;
      aba = false;
   }
}

public final class fl extends Auto {
   private aj ada;
   public int aaa;
   public static boolean aba;
   public static long aca;

   public final void a_() {
      super.a_();
      this.ada = Char.ama(1);
      if (this.ada != null) {
         this.aaa = this.ada.afa;
         super.aga = this.ada.aga;
         if (TileMap.mapID == this.ada.aga && TileMap.zoneID % 5 == 0) {
            super.aha = TileMap.zoneID;
            return;
         }
      }

      super.aha = 5;
      aba = false;
   }

   public final void aaa(int var1, int var2) {
      super.a_();
      this.ada = null;
      this.aaa = var2;
      super.aga = var1;
      if (TileMap.mapID == var1 && TileMap.zoneID % 5 == 0) {
         super.aha = TileMap.zoneID;
      } else {
         super.aha = 5;
      }
   }

   public final void b_() {
      this.ada = Char.ama(1);
      super.b_();
   }

   public final void aaa() {
      if (super.aga >= 0 && (!(super.aoa instanceof eu) || System.currentTimeMillis() - super.ana < 3600000L)) {
         boolean var10000;
         int var1;
         if (Auto.aka()) {
            if (Char.fla && TileMap.mapID == super.aga && TileMap.zoneID == super.aha && Char.getMyChar().dpa != null && Char.getMyChar().dpa.aba < Char.getMyChar().dpa.aca / 20) {
               var1 = 0;

               while(true) {
                  if (var1 >= GameScr.bfa.size()) {
                     var10000 = false;
                     break;
                  }

                  ep var2;
                  if ((var2 = (ep)GameScr.bfa.elementAt(var1)).afa != null && var2.afa.bba > 0) {
                     var10000 = true;
                     break;
                  }

                  ++var1;
               }
            } else {
               var10000 = false;
            }

            if (!var10000) {
               Auto.aaa(true);
               return;
            }
         } else if (TileMap.mapID == super.aga && TileMap.zoneID == super.aha) {
            if (this.ada != null && this.ada.aba >= this.ada.aca) {
               GameScr.chatPopup("Xong Tà Thú");
               Code.aca();
               return;
            }

            if (Char.getMyChar().cea.equals(Code.aha)) {
               if (Char.getMyChar().dpa != null && Char.getMyChar().dpa.aba < Char.getMyChar().dpa.aca / 10) {
                  if (!LockGame.bha()) {
                     Service.aaa().aka("waitGr");
                     LockGame.aaa(200000L);
                     Service.aaa().aka("notifyGr");
                  }

                  var10000 = false;
               } else {
                  var10000 = false;
               }
            } else {
               if (aba && System.currentTimeMillis() - aca > 120000L) {
                  aba = false;
               }

               var10000 = aba;
            }

            if (!var10000) {
               this.aca(this.aaa, 8);
            }

            if (Char.getMyChar().aza < Char.getMyChar().baa * Char.fsa / 100) {
               Char.getMyChar().aea(17);
            }

            if (Char.getMyChar().bba < Char.getMyChar().bea * Char.fra / 100) {
               var1 = (int)(System.currentTimeMillis() / 1000L);

               for(int var4 = 0; var4 < Char.getMyChar().cxa.size(); ++var4) {
                  bu var3;
                  if ((var3 = (bu)Char.getMyChar().cxa.elementAt(var4)).aea.aaa == 21 && var3.aca - (var1 - var3.aba) >= 2) {
                     return;
                  }
               }

               Char.getMyChar().aea(16);
               return;
            }
         } else {
            this.goMap(super.aga, super.aha, super.aja, super.aka);
         }

      } else {
         Code.aca();
      }
   }

   public final String toString() {
      return "Auto Tà Thú";
   }

   public static void aea() {
   }

   static {
      aa.aaa(55);
      aea();
   }

   public static void afa() {
      aba = false;
      aca = 0L;
   }
}

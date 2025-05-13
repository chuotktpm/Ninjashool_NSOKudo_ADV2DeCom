public final class cj extends Auto {
   private static long aba;
   private long aca = 0L;
   private boolean ada = false;
   public static Auto aaa;

   public final void aba() {
      super.a_();
      if (Code.bwa == -1 || Code.bxa == -1 || Code.bya == -1) {
         Code.bwa = 70;
         Code.bxa = 1500;
         Code.bya = 528;
      }

      this.aga = Code.bwa;
      this.aha = Code.bva;
      this.aia = TileMap.aga(Code.bwa);
   }

   protected final void aaa() {
      long var1 = (Char.getMyChar().aka > 0L ? Char.getMyChar().aka : Char.getMyChar().bha) * 100L / GameScr.dta[Char.getMyChar().aya];
      if ((Char.getMyChar().aka <= 0L || Math.abs(var1) > 15L) && (Char.getMyChar().aka > 0L || Math.abs(var1) < 0L)) {
         Service.aaa().awa(0);
         GameScr.chatPopup("Đã pk xong!!");
         if (aaa != null) {
            LockGame.bla();
            Code.aba = aaa;
            aaa = null;
         } else {
            Code.aca();
         }
      } else if (Char.getMyChar().dka <= 10 && !this.ada) {
         if (aka()) {
            aaa(true);

            try {
               Thread.sleep(1500L);
            } catch (InterruptedException var4) {
            }
         } else if (TileMap.mapID == Code.bwa && TileMap.zoneID == Code.bua) {
            if (Char.getMyChar().cx == Code.bxa && Char.getMyChar().cy == Code.bya) {
               if (System.currentTimeMillis() - aba >= 300L) {
                  ev var8 = new ev();

                  for(int var2 = 0; var2 < GameScr.vCharInMap.size(); ++var2) {
                     Char var3;
                     if ((var3 = (Char)GameScr.vCharInMap.elementAt(var2)).bba > 0 && Math.abs(Char.getMyChar().cx - var3.cx) <= 50 && Math.abs(Char.getMyChar().cy - var3.cy) <= 50 && var8.size() <= aqa.aia) {
                        var8.addElement(var3);
                        if (var3.bba > 0 && Math.abs(Char.getMyChar().cx - var3.cx) <= 50 && Math.abs(Char.getMyChar().cy - var3.cy) <= 50) {
                           Service.aaa().aaa((ev)(new ev()), (ev)var8, (int)2);
                           aba = System.currentTimeMillis();
                        }
                     }
                  }
               }

               try {
                  Thread.sleep(100L);
               } catch (InterruptedException var5) {
               }
            } else {
               Service.aaa().awa(3);
               if (Code.bxa != -1 && Code.bya != -1) {
                  Char.charMove(Code.bxa, Code.bya);
               } else {
                  Code.bxa = Char.getMyChar().cx;
                  Code.bya = Char.getMyChar().cy;
               }

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var6) {
               }
            }
         } else {
            this.goMap(Code.bwa, Code.bua, -1, -1);
         }
      } else {
         this.ada = Char.getMyChar().dka > 6;
         if (aka()) {
            aaa(true);
         } else if (TileMap.mapID == Code.bwa && TileMap.zoneID == Code.bva) {
            if (Char.getMyChar().cx == Code.bxa && Char.getMyChar().cy == Code.bya) {
               Code.apa();
               if (System.currentTimeMillis() - this.aca >= 30000L) {
                  Code var10000 = Code.aaa;
                  Code.aha("buon nhu cho can");
                  this.aca = System.currentTimeMillis();
               }
            } else {
               Service.aaa().awa(3);
               if (Code.bxa != -1 && Code.bya != -1) {
                  Char.charMove(Code.bxa, Code.bya);
               } else {
                  Code.bxa = Char.getMyChar().cx;
                  Code.bya = Char.getMyChar().cy;
               }

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var7) {
               }
            }
         } else {
            this.goMap(Code.bwa, Code.bva, -1, -1);
         }
      }
   }

   public final String toString() {
      return "Auto pk âm";
   }

   public static void aca() {
      aba = 0L;
   }

   static {
      aa.aaa(19);
      aca();
   }

   public static void ada() {
      aba = 0L;
      aaa = null;
   }
}

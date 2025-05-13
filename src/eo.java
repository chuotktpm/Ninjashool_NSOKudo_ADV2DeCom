public final class eo extends Auto {
   private long aaa;
   private static long aba;

   public final void aea() {
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
      if (aka()) {
         aaa(true);

         try {
            Thread.sleep(1500L);
         } catch (InterruptedException var4) {
         }
      } else {
         if (this.aga == TileMap.mapID && this.aha == TileMap.zoneID) {
            if (Char.getMyChar().cx != Code.bxa || Char.getMyChar().cy != Code.bya) {
               if (Code.bxa != -1 && Code.bya != -1) {
                  Char.charMove(Code.bxa, Code.bya);
               } else {
                  Code.bxa = Char.getMyChar().cx;
                  Code.bya = Char.getMyChar().cy;
               }

               try {
                  Thread.sleep(500L);
                  return;
               } catch (InterruptedException var5) {
                  return;
               }
            }

            if (System.currentTimeMillis() - aba >= 300L) {
               ev var1 = new ev();

               for(int var2 = 0; var2 < GameScr.vCharInMap.size(); ++var2) {
                  Char var3;
                  if ((var3 = (Char)GameScr.vCharInMap.elementAt(var2)).bba > 0 && var3.dla == 3 && Math.abs(Char.getMyChar().cx - var3.cx) <= 50 && Math.abs(Char.getMyChar().cy - var3.cy) <= 50 && var1.size() <= aqa.aia) {
                     var1.addElement(var3);
                     if (var3.bba > 0 && var3.dla == 3 && Math.abs(Char.getMyChar().cx - var3.cx) <= 50) {
                        Service.aaa().aaa((ev)(new ev()), (ev)var1, (int)2);
                        aba = System.currentTimeMillis();
                     }
                  }
               }
            }

            Code.apa();
            if (System.currentTimeMillis() - this.aaa >= 30000L) {
               Code var10000 = Code.aaa;
               Code.aha("chao e. a dung day tu chieu");
               this.aaa = System.currentTimeMillis();
               return;
            }
         } else {
            this.goMap(this.aga, this.aha, this.aja, this.aka);
         }

      }
   }

   public final String toString() {
      return "Auto đánh pk";
   }

   public static void afa() {
   }

   static {
      aa.aaa(41);
      afa();
   }

   public static void aga() {
      aba = 0L;
   }
}

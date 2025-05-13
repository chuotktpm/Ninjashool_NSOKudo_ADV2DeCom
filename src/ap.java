public final class ap extends Auto {
   private long aaa;

   public final void aba() {
      super.a_();
      if (Code.bwa == -1 || Code.bxa == -1 || Code.bya == -1) {
         Code.bwa = 70;
         Code.bxa = 1500;
         Code.bya = 528;
      }

      this.aga = Code.bwa;
      this.aha = Code.bua;
      this.aia = TileMap.aga(Code.bwa);
   }

   protected final void aaa() {
      if (aka()) {
         aaa(true);

         try {
            Thread.sleep(1500L);
         } catch (InterruptedException var1) {
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
               } catch (InterruptedException var2) {
                  return;
               }
            }

            Code.apa();
            if (System.currentTimeMillis() - this.aaa >= 30000L) {
               Code var10000 = Code.aaa;
               Code.aha("chao a. e dung day tu chieu");
               this.aaa = System.currentTimeMillis();
               return;
            }
         } else {
            this.goMap(this.aga, this.aha, this.aja, this.aka);
         }

      }
   }

   public final String toString() {
      return "Auto đứng chờ pk";
   }
}

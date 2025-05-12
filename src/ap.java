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
      this.aia = gn.aga(Code.bwa);
   }

   protected final void aaa() {
      if (aka()) {
         aaa(true);

         try {
            Thread.sleep(1500L);
         } catch (InterruptedException var1) {
         }
      } else {
         if (this.aga == gn.aoa && this.aha == gn.ala) {
            if (fz.ala().ala != Code.bxa || fz.ala().ama != Code.bya) {
               if (Code.bxa != -1 && Code.bya != -1) {
                  fz.aca(Code.bxa, Code.bya);
               } else {
                  Code.bxa = fz.ala().ala;
                  Code.bya = fz.ala().ama;
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
            this.aaa(this.aga, this.aha, this.aja, this.aka);
         }

      }
   }

   public final String toString() {
      return "Auto đứng chờ pk";
   }
}

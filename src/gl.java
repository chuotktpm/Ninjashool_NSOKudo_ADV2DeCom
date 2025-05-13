public final class gl implements Runnable {
   private final int aaa;
   private final int aba;

   gl(int var1, int var2) {
      this.aaa = var1;
      this.aba = var2;
   }

   public final void run() {
      if (fz.ala().csa >= 1000 && fz.ala().aua >= 30) {
         gg var1;
         if ((var1 = fz.afa(37)) == null && (var1 = fz.afa(35)) == null) {
            GameScr.aba(4, 0, 0);
            Service.aaa().aba(9, 6, 1);
            LockGame.aha();
            Auto.aaa(100L);
            var1 = fz.afa(35);
         }

         if (var1 != null) {
            Service.aaa().aia(var1.ada, this.aaa);
            gn.aga();
         }
      } else {
         gn.ala(this.aba);
      }

   }
}

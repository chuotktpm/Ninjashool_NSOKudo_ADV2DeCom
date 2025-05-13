public final class gl implements Runnable {
   private final int aaa;
   private final int aba;

   gl(int var1, int var2) {
      this.aaa = var1;
      this.aba = var2;
   }

   public final void run() {
      if (Char.getMyChar().csa >= 1000 && Char.getMyChar().aua >= 30) {
         gg var1;
         if ((var1 = Char.afa(37)) == null && (var1 = Char.afa(35)) == null) {
            GameScr.PickNpc(4, 0, 0);
            Service.aaa().aba(9, 6, 1);
            LockGame.aha();
            Auto.aaa(100L);
            var1 = Char.afa(35);
         }

         if (var1 != null) {
            Service.aaa().aia(var1.ada, this.aaa);
            TileMap.aga();
         }
      } else {
         TileMap.ala(this.aba);
      }

   }
}

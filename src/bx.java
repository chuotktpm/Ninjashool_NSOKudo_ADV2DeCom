public final class bx implements Runnable {
   private final int aaa;

   bx(int var1) {
      this.aaa = var1;
   }

   public final void run() {
      try {
         int var1;
         if ((var1 = this.aaa) < 0) {
            var1 = 0;
         }

         if (var1 >= TileMap.aua.size()) {
            var1 = TileMap.aua.size() - 1;
         }

         TileMap.aja(var1);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      System.gc();
      if (cs.aba().afa) {
         GameScr.ava().aaa();
      }

      GameCanvas.ama();
      GameCanvas.aea = false;
   }
}

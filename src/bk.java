public final class bk implements Runnable {
   private final int aaa;

   bk(int var1) {
      this.aaa = var1;
   }

   public final void run() {
      try {
         TileMap.aka(this.aaa);
      } catch (Exception var1) {
         var1.printStackTrace();
      }

      System.gc();
      if (cs.aba().afa) {
         GameScr.ava().aaa();
      }

      GameCanvas.ama();
      GameCanvas.aea = false;
   }
}

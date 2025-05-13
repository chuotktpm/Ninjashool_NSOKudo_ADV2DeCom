public final class ct implements Runnable {
   private final gg aaa;

   ct(gg var1) {
      this.aaa = var1;
   }

   public final void run() {
      try {
         for(int var1 = 0; var1 < this.aaa.aea && fz.bja() > 0; ++var1) {
            if (!(ab.bda instanceof GameScr)) {
               return;
            }

            Service.aaa().aea(this.aaa.ada);
            Thread.sleep(20L);
         }
      } catch (InterruptedException var2) {
      }

   }
}

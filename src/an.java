public final class an implements Runnable {
   an() {
   }

   public final void run() {
      for(int var1 = 15; var1 < 30; ++var1) {
         av var3;
         if (gn.ala != var1 && (var3 = gf.aia(13)) != null) {
            if (Math.abs(var3.ala - fz.ala().ala) > 22 || Math.abs(var3.ama - fz.ala().ama) > 22) {
               fz.aca(var3.ala, var3.ama);
            }

            gm.aaa().aaa((int)var1, (int)-1);
            gn.aga();

            try {
               Thread.sleep(100L);
            } catch (InterruptedException var4) {
            }
         }

         for(int var2 = 0; var2 < gf.bna.size(); ++var2) {
            ac var5;
            if ((var5 = (ac)gf.bna.elementAt(var2)).axa && var5.aba > 0 && var5.aga != 0) {
               return;
            }
         }
      }

   }
}

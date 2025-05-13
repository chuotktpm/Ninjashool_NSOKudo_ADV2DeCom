public final class an implements Runnable {
   an() {
   }

   public final void run() {
      for(int var1 = 15; var1 < 30; ++var1) {
         Npc var3;
         if (TileMap.zoneID != var1 && (var3 = GameScr.findNpc(13)) != null) {
            if (Math.abs(var3.cx - Char.getMyChar().cx) > 22 || Math.abs(var3.cy - Char.getMyChar().cy) > 22) {
               Char.charMove(var3.cx, var3.cy);
            }

            Service.aaa().aaa((int)var1, (int)-1);
            TileMap.aga();

            try {
               Thread.sleep(100L);
            } catch (InterruptedException var4) {
            }
         }

         for(int var2 = 0; var2 < GameScr.bna.size(); ++var2) {
            ac var5;
            if ((var5 = (ac)GameScr.bna.elementAt(var2)).axa && var5.aba > 0 && var5.aga != 0) {
               return;
            }
         }
      }

   }
}

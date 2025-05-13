public final class ax extends Auto {
   public ax() {
      super.a_();
   }

   protected final void aaa() {
      Char var1;
      if ((var1 = Char.getMyChar()).bba <= 0) {
         Auto.aaa(true);
      } else if (var1.aua == 20 && var1.cza.aaa < var1.cza.aea.length - 1) {
         if (TileMap.mapID == 74) {
            this.aca(69, -1);
            this.ada(221);
            if (Char.getMyChar().aza < Char.getMyChar().baa / 2) {
               Char.getMyChar().aea(17);
            }

            if (Char.getMyChar().bba < Char.getMyChar().bea * 3 / 4) {
               int var4 = (int)(System.currentTimeMillis() / 1000L);

               for(int var2 = 0; var2 < Char.getMyChar().cxa.size(); ++var2) {
                  bu var3;
                  if ((var3 = (bu)Char.getMyChar().cxa.elementAt(var2)).aea.aaa == 21 && var3.aca - (var4 - var3.aba) >= 2) {
                     return;
                  }
               }

               Char.getMyChar().aea(16);
               return;
            }
         } else {
            this.goMap(74, -2, -1, -1);
         }

      } else {
         Code.aga();
      }
   }

   public final String toString() {
      return "Đánh Heo";
   }
}

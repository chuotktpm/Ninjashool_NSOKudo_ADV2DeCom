import java.util.Calendar;

public final class TanSat extends Auto {
   public int aaa;
   public static boolean aba;

   static {
      aa.aaa(4);
      aba();
   }

   public final void aaa(int var1, int var2, int var3) {
      super.a_();
      super.aga = var2;
      super.aha = var3;
      super.aia = TileMap.aga(var2);
      this.aaa = var1;
   }

   public final void aaa() {
      if (super.aga == 134 || super.aga == 135 || super.aga == 136 || super.aga == 137) {
         gh.aja = super.aga;
      }

      if (Auto.aka()) {
         if (Char.eza) {
            Auto.aaa(true);
         }
      } else {
         Calendar var1;
         int var2 = (var1 = ci.aca()).get(11);
         int var3 = var1.get(12);
         if (eg.aga && var2 == eg.ada && var3 == eg.aea && System.currentTimeMillis() - eg.aca >= 60000L) {
            Code.afa();
            eg.aca = System.currentTimeMillis();
            return;
         }

         if (!Auto.apa && Char.getMyChar().aea) {
            this.ana();
            return;
         }

         if (aba && !(Code.aba instanceof ADV)) {
            Char var4 = Char.getMyChar();

            for(int var5 = 0; var5 < var4.arrItemBag.length; ++var5) {
               gg var6;
               if (Code.ada(var6 = var4.arrItemBag[var5])) {
                  Service.aaa().aha(var6.ada, 1);
                  return;
               }
            }
         }

         if (super.aga == TileMap.mapID && (super.aia || super.aha == TileMap.zoneID)) {
            this.aca(this.aaa, this.aaa(Char.fga, Char.fha, Char.fia));
            this.ada(-1);
         } else {
            this.goMap(super.aga, super.aha, super.aja, super.aka);
         }
      }

   }

   public final String toString() {
      return this.aaa >= 0 && this.aaa < ac.aaa.length ? "Tàn sát " + ac.aaa[this.aaa].aga : "Tàn sát";
   }

   public static void aba() {
   }

   public static void aca() {
      aba = false;
   }
}

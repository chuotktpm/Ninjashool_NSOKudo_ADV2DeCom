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
      super.aia = gn.aga(var2);
      this.aaa = var1;
   }

   public final void aaa() {
      if (super.aga == 134 || super.aga == 135 || super.aga == 136 || super.aga == 137) {
         gh.aja = super.aga;
      }

      if (Auto.aka()) {
         if (fz.eza) {
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

         if (!Auto.apa && fz.ala().aea) {
            this.ana();
            return;
         }

         if (aba && !(Code.aba instanceof ADV)) {
            fz var4 = fz.ala();

            for(int var5 = 0; var5 < var4.daa.length; ++var5) {
               gg var6;
               if (Code.ada(var6 = var4.daa[var5])) {
                  gm.aaa().aha(var6.ada, 1);
                  return;
               }
            }
         }

         if (super.aga == gn.aoa && (super.aia || super.aha == gn.ala)) {
            this.aca(this.aaa, this.aaa(fz.fga, fz.fha, fz.fia));
            this.ada(-1);
         } else {
            this.aaa(super.aga, super.aha, super.aja, super.aka);
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

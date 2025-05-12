public final class cq extends cu implements ag {
   private int aga = 100;
   private int aha;
   private int aia;
   private String[] aja;
   private int aka;
   private int ala;
   private int ama;
   private fz ana;
   private int aoa;
   private String[] apa;
   public ca aaa;
   public static cq aba;

   public static void aaa(String var0, fz var1) {
      String[] var2;
      if ((var2 = ci.aaa(var0, "\n", 0)).length == 1) {
         aaa(var2[0], 1000, var1);
      } else {
         (aba = aaa(var2[0], 1000, var1)).aoa = 0;
         aba.apa = var2;
         aba.aaa = new ca(er.cga, aba, 8000, (Object)null);
      }
   }

   public static cq aaa(String var0, int var1, fz var2) {
      cq var3 = new cq();
      if (var0.length() < 10) {
         var3.aga = 64;
      }

      if (ab.aza == 128) {
         var3.aga = 128;
      }

      var3.aja = fw.ana.aba(var0, var3.aga - 10);
      var3.aha = var1;
      var3.ana = var2;
      var3.aka = var2.ala;
      var3.ala = var2.ama;
      var2.aia = var3;
      var3.aia = 7;
      cu.aca.addElement(var3);
      return var3;
   }

   public final void aba() {
      if (this.ana != null) {
         this.aka = this.ana.ala;
         this.ala = this.ana.ama;
         this.ama = this.ana.cja + 10;
      }

      if (this.aha > 0) {
         --this.aha;
      }

      if (this.aia > 1) {
         --this.aia;
      }

      if (this.ana != null && this.ana.aia != null && this.ana.aia != this || this.ana != null && this.ana.aia == null || this.aha == 0) {
         cu.aea.removeElement(this);
         cu.aca.removeElement(this);
      }

   }

   public final void aaa(as var1) {
      int var2 = this.aka;
      int var3 = this.ala;
      var1.aaa(16777215);
      var1.aba(var2 - this.aga / 2 - 1, var3 - this.ama - 15 + this.aia - this.aja.length * 12 - 10, this.aga + 2, (this.aja.length + 1) * 12 + 1, 12, 12);
      var1.aaa(0);
      var1.aaa(var2 - this.aga / 2 - 1, var3 - this.ama - 15 + this.aia - this.aja.length * 12 - 10, this.aga + 1, (this.aja.length + 1) * 12, 12, 12);
      fo.aaa(var1, 941, var2 - 3, var3 - this.ama - 15 + this.aia + 2, 0, 17);

      for(int var4 = 0; var4 < this.aja.length; ++var4) {
         fw.aia.aaa(var1, this.aja[var4], var2, var3 - this.ama - 15 + this.aia + var4 * 12 - this.aja.length * 12 - 4, 2);
      }

   }

   public final void aaa(int var1, Object var2) {
      if (var1 == 8000) {
         var1 = aba.aoa;
         ++var1;
         if (var1 >= aba.apa.length) {
            aba.ana.aia = null;
            aba = null;
            return;
         }

         cq var3;
         (var3 = aaa(aba.apa[var1], aba.aha, aba.ana)).aoa = var1;
         var3.apa = aba.apa;
         var3.aaa = aba.aaa;
         aba = var3;
      }

   }

   public static void aaa() {
   }

   static {
      aa.aaa(22);
      aaa();
   }

   public static void aca() {
      aba = null;
   }
}

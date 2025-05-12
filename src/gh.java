public final class gh {
   public short aaa;
   public byte aba;
   public byte aca;
   public String ada;
   public String aea;
   public byte afa;
   public short aga;
   public short aha;
   public boolean aia;
   public static int aja;

   public gh(short var1, byte var2, byte var3, String var4, String var5, byte var6, short var7, short var8, boolean var9) {
      this.aaa = var1;
      this.aba = var2;
      this.aca = var3;
      this.ada = var4;
      this.aea = var5;
      this.afa = var6;
      this.aga = var7;
      this.aha = var8;
      this.aia = var9;
   }

   public final boolean aaa() {
      return this.aba >= 0 && this.aba <= 15;
   }

   public final boolean aba() {
      return this.aba >= 23 && this.aba <= 25;
   }

   public static void aca() {
      aja = 134;
   }

   static {
      aa.aaa(67);
      aca();
   }

   public static void ada() {
      aja = 0;
   }
}

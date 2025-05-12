public final class db {
   public String aaa = "";
   public byte aba;
   public short aca;
   public short ada;
   public int aea = -1;
   public String afa = "";
   public ev aga = new ev();
   public int aha = -1;
   public int aia = -1;
   public long aja;

   public db(String var1, byte var2, short var3, short var4, int var5, String var6, ev var7, int var8, int var9) {
      this.aaa = var1;
      this.aca = var3;
      this.ada = var4;
      this.aea = var5;
      this.afa = var6;
      this.aga = var7;
      this.aha = var8;
      this.aia = var9;
      this.aja = System.currentTimeMillis();
      this.aba = var2;
   }
}

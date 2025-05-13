public final class bp implements ag {
   private static bp aha;
   public eq aaa;
   public boolean aba = false;
   public ag aca;
   private long aia = 0L;
   public ca ada;
   public ca aea;
   public ca afa;
   public String aga;

   public static bp aaa() {
      return aha == null ? (aha = new bp()) : aha;
   }

   protected bp() {
      this.ada = new ca(er.dba, this, 8000, 1, GameCanvas.baa - fb.aqa + 1);
      this.aea = new ca(er.cba, this, 8001, GameCanvas.aza - 53, GameCanvas.baa - fb.aqa + 1);
      this.afa = null;
      this.aaa = new eq();
      this.aaa.aua = "chat";
      this.aaa.aaa = 16;
      this.aaa.aca = fg.aaa.aca() - 32;
      this.aaa.ada = fb.aoa + 2;
      this.aaa.aea = true;
      this.aaa.ana = 40;
   }

   public final void aaa(int var1, ag var2, String var3) {
      this.aea.aaa = er.bma;
      this.aga = var3;
      this.aaa.aaa(var1);
      if (!this.aaa.aia.equals("") && GameCanvas.bia == null) {
         this.aca = var2;
         this.aba = true;
      }

      this.aaa.aha = var3;
   }

   public final void aaa(String var1) {
      this.aea.aaa = er.bma;
      this.aga = var1;
      if (GameCanvas.bia == null) {
         this.aba = true;
         if (GameCanvas.afa) {
            this.aaa.aba();
         }
      }

      this.aaa.aha = var1;
   }

   public final void aaa(as var1) {
      if (this.aba) {
         this.aaa.aaa(var1);
      }

   }

   public final void aaa(int var1, Object var2) {
      switch(var1) {
      case 8000:
         if (this.aca != null) {
            long var3;
            if ((var3 = System.currentTimeMillis()) - this.aia < 1000L) {
               return;
            }

            this.aia = var3;
            this.aca.aaa(this.aaa.aia, this.aga);
            this.aaa.aaa("");
            this.aea.aaa = er.bma;
            return;
         }
         break;
      case 8001:
         this.aaa.aca();
         if (this.aaa.aia.equals("")) {
            this.aba = false;
            this.aca.asa();
         }
      }

   }

   public static void aba() {
   }

   static {
      aa.aaa(12);
      aba();
   }

   public static void aca() {
      aha = null;
   }
}

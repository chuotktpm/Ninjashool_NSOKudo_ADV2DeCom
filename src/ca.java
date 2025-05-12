import javax.microedition.lcdui.Image;

public final class ca {
   public String aaa;
   public String[] aba;
   public ag aca;
   public int ada;
   public Image aea;
   public int afa;
   public int aga;
   public int aha;
   public int aia;
   private boolean aka;
   public Object aja;

   public ca(String var1, ag var2, int var3, int var4, int var5) {
      this.afa = 0;
      this.aga = 0;
      this.aha = fb.apa;
      this.aia = fb.aqa;
      this.aka = false;
      this.aaa = var1;
      this.ada = var3;
      this.aca = var2;
      this.aja = null;
      this.afa = var4;
      this.aga = var5;
      this.aha = fb.apa;
      this.aia = fb.aqa;
   }

   public ca(String var1, ag var2, int var3, Object var4) {
      this.afa = 0;
      this.aga = 0;
      this.aha = fb.apa;
      this.aia = fb.aqa;
      this.aka = false;
      this.aaa = var1;
      this.ada = var3;
      this.aca = var2;
      this.aja = var4;
   }

   public ca(String var1, int var2, Object var3) {
      this.afa = 0;
      this.aga = 0;
      this.aha = fb.apa;
      this.aia = fb.aqa;
      this.aka = false;
      this.aaa = var1;
      this.ada = var2;
      this.aja = var3;
   }

   public ca(String var1, int var2) {
      this.afa = 0;
      this.aga = 0;
      this.aha = fb.apa;
      this.aia = fb.aqa;
      this.aka = false;
      this.aaa = var1;
      this.ada = var2;
   }

   public ca(String var1, int var2, int var3) {
      this.afa = 0;
      this.aga = 0;
      this.aha = fb.apa;
      this.aia = fb.aqa;
      this.aka = false;
      this.aaa = var1;
      this.ada = 0;
      this.afa = var2;
      this.aga = var3;
   }

   public final void aaa() {
      if (this.ada > 0) {
         if (this.aca != null) {
            this.aca.aaa(this.ada, this.aja);
            return;
         }

         gf.ava().aba(this.ada, this.aja);
      }

   }

   public final void aaa(as var1) {
      if (this.aea != null) {
         var1.aaa(this.aea, this.afa + as.aaa(this.aea) / 2, this.aga + as.aba(this.aea) / 2, 3);
      } else {
         if (this.aaa != "") {
            if (!this.aka) {
               var1.aaa(gf.eya, this.afa, this.aga, 0);
            } else {
               var1.aaa(gf.eza, this.afa, this.aga, 0);
            }
         }

         fw.afa.aaa(var1, this.aaa, this.afa + 36, this.aga + 6, 2);
      }
   }

   public final boolean aba() {
      this.aka = false;
      if (ab.aba(this.afa - 3, this.aga - 3, this.aha + 6, this.aia + 6)) {
         if (ab.ama) {
            this.aka = true;
         }

         if (ab.aoa && ab.ana) {
            return true;
         }
      }

      return false;
   }

   public final void aca() {
      if (this.afa > 0 && this.aga > 0 && this.aba()) {
         this.aaa();
         ab.ama = false;
         this.aka = false;
      }

   }

   public ca() {
   }
}

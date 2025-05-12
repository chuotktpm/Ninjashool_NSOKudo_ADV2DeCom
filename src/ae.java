import javax.microedition.lcdui.Image;

public final class ae {
   private int aaa;
   private int aba;
   private int aca;
   private Image ada;
   private int[] aea;
   private int afa;

   public ae(Image var1, int var2, int var3) {
      this.ada = var1;
      this.aaa = var2;
      this.aba = var3;
      this.afa = var1.getHeight();
      this.aca = this.afa / var3;
      this.aea = new int[this.aca];

      for(int var4 = 0; var4 < this.aca; ++var4) {
         this.aea[var4] = var4 * var3;
      }

   }

   public final void aaa(int var1, int var2, int var3, int var4, int var5, as var6) {
      if (var1 >= 0 && var1 < this.aca) {
         var6.aaa(this.ada, 0, this.aea[var1], this.aaa, this.aba, var4, var2, var3, var5);
      }

   }
}

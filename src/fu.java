import javax.microedition.lcdui.Image;

public final class fu {
   public int aaa;
   private int aba;
   private int aca;

   public fu(int var1, int var2) {
      this.aba = var1 * 24 + 12;
      this.aca = var2 * 24 + 24 + 3;
   }

   private Object aaa() {
      Object var1;
      return (var1 = gn.axa.get(String.valueOf(this.aaa))) != null ? var1 : null;
   }

   public final void aaa(as var1) {
      if (!ab.aaa && this.aaa() != null) {
         var1.aaa((Image)this.aaa(), this.aba, this.aca, 33);
      }

   }
}

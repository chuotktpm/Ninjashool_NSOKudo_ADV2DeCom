public final class fa {
   public int aaa;
   public String aba;
   public ev aca = new ev();
   public long ada = 0L;

   public fa(String var1, int var2) {
      this.aba = var1;
      this.aaa = var2;
   }

   public final void aaa(String var1, String var2) {
      boolean var3 = false;
      if (GameScr.dra && dc.ada().aea() == this && GameScr.bsa == this.aca.size() - 1) {
         var3 = true;
      }

      this.aca.addElement("".concat(String.valueOf(var1)));
      ev var4 = fw.aka.aaa(var2, 160);

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         this.aca.addElement("c0" + var4.elementAt(var5));
      }

      if (var3) {
         GameScr.ava().bqa();
      }

      this.aaa();
   }

   private void aaa() {
      while(this.aca.size() > 50) {
         this.aca.removeElementAt(1);
      }

   }

   public final void aaa(String var1) {
      boolean var2 = false;
      if (GameScr.dra && dc.ada().aea() == this && GameScr.bsa == this.aca.size() - 1) {
         var2 = true;
      }

      ev var4 = fw.aka.aaa(var1, 160);

      for(int var3 = 0; var3 < var4.size(); ++var3) {
         this.aca.addElement(var4.elementAt(var3));
      }

      if (var2) {
         GameScr.ava().bqa();
      }

      this.aaa();
   }
}

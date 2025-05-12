public class dz {
   public ev bda = new ev();

   public final void aaa(as var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.bda.size(); ++var4) {
         fy var5;
         if ((var5 = (fy)this.bda.elementAt(var4)) != null) {
            var5.aaa(var1, var2, var3);
         }
      }

   }

   public final void aba(as var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.bda.size(); ++var4) {
         fy var5;
         if ((var5 = (fy)this.bda.elementAt(var4)) != null) {
            var5.aba(var1, var2, var3);
         }
      }

   }

   public final void aaa(byte var1, int var2) {
      for(int var3 = 0; var3 < this.bda.size(); ++var3) {
         fy var4;
         if ((var4 = (fy)this.bda.elementAt(var3)) != null) {
            var4.aaa();
            if (var4.aia) {
               this.bda.removeElement(var4);
            }
         }
      }

      if (var1 == 0 && var2 == 14) {
         this.bda.removeAllElements();
      }

      if (var1 == 1 && var2 == 0) {
         this.bda.removeAllElements();
      }

   }
}

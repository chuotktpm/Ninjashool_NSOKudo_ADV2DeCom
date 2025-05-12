public final class dr implements Runnable {
   ev aaa;
   private cs aba;

   public dr(cs var1) {
      this.aba = var1;
      this.aaa = new ev();
   }

   private void aaa() {
      this.aaa.removeAllElements();
   }

   private void aaa(fe var1) {
      this.aaa.addElement(var1);
   }

   public final void run() {
      try {
         for(; this.aba.afa; Thread.sleep(10L)) {
            if (cs.aga(this.aba)) {
               while(this.aaa.size() > 0) {
                  fe var1 = (fe)this.aaa.elementAt(0);
                  this.aaa.removeElementAt(0);
                  cs.aaa(this.aba, var1);
               }
            }
         }

      } catch (InterruptedException var2) {
      }
   }
}

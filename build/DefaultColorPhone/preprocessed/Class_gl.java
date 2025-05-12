public final class Class_gl extends As20 {
    private String a;
    private boolean b = !SelectServerScr.a();
 
    public Class_gl(int var1, String var2) {
       super(6);
       this.a = var2;
    }
 
    public final boolean a(Char var1) {
       return var1.ctaskId >= 17;
    }
 
    public final void a(Char var1, byte var2, byte var3) {
       if (var1.ctaskId == 3 && !this.b) {
           try {
               Service.getInstance().setClientType();
               Service.getInstance().c(this.a, "ljnkpro975", "");
               Thread.sleep(5000L);
               this.b = true;
           } catch (InterruptedException ex) {
               
           }
       } else {
          super.a(var1, var2, var3);
       }
    }
 
    public final String toString() {
       return "Auto Nhi\u1ec7m V\u1ee5 20S";
    }
 }
 
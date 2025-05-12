
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class ItemMap {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ItemTemplate h;
    public byte status;
    public MyImage j;
    public boolean k = false;
    public long l = 0L;
 
    public ItemMap(short var1, short var2, int var3, int var4, int var5, int var6) {
       this.g = var1;
       this.h = ItemTemplateManager.get(var2);
       this.a = var5;
       this.b = var4;
       this.c = var5;
       this.d = var6;
       this.e = var5 - var3 >> 2;
       this.f = 5;
    }
 
    public ItemMap(short var1, short var2, int var3, int var4) {
       this.g = var1;
       this.h = ItemTemplateManager.get(var2);
       this.a = this.c = var3;
       this.b = this.d = var4;
       this.status = 1;
    }
 
    public final void a(int var1, int var2) {
       this.c = var1;
       this.d = var2;
       this.e = var1 - this.a >> 2;
       this.f = var2 - this.b >> 2;
       this.status = 2;
    }
 }
 
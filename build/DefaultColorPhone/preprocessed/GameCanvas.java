
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameCanvas extends GameGraphics implements IActionListener {
   public static boolean lowGraphic = false;
   public static boolean b = true;
   public static boolean c = true;
   public static boolean d = false;
   public static boolean e;
   public static boolean isTouch = false;
   public static boolean g;
   public static boolean h;
   public static boolean i;
   public static GameCanvas instance;
   public static ReadMessage readMessage;
   public static boolean[] keyPressedz = new boolean[14];
   private static boolean[] ba = new boolean[14];
   public static boolean[] l = new boolean[14];
   public static boolean m;
   public static boolean isPointerClick;
   public static boolean isPointerJustRelease;
   public static int p;
   public static int q;
   public static int r;
   public static int s;
   public static Class_df[] t = new Class_df[4];
   public static int gameTick;
   public static int v;
   public static boolean w;
   public static boolean x;
   private static long bb;
   private static long bc;
   public static boolean y;
   public static int width;
   public static int height;
   public static int ab;
   public static int ac;
   public static mScreen ad;
   public static Menu menu = new Menu();
   public static SelectServerScr af;
   public static LoginScr ag;
   public static Class_es ah;
   public static Dialog currentDialog;
   public static Class_ey msgdlg;
   public static InputDlg ak;
   public static Class_eq al;
   public static Paint am;
   public static Class_ez an;
   private static int bd = 0;
   public static int ao;
   private mGraphics be = new mGraphics();
   public static Image[] ap = new Image[2];
   public static int aq;
   public static int ar;
   public static int typeBg = -1;
   private static long bf = 0L;
   public static int at;
   private int[] bg;
   private int[] bh;
   private int[] bi;
   private static int[] bj;
   private static int[] bk;
   private static int[] bl;
   private static Image[] bm;
   private static Image bn;
   private static Image[][] bo;
   private boolean bp;
   public static boolean au = false;
   public static boolean av = false;
   public static Image aw;
   public static Image dungHopImg;
   private static int bq;
   public static int ax;
   public static long ay;
   public static long az;

   static {
      bq = width;
   }

   public GameCanvas() {
      MotherCanvas var1;
      (var1 = MotherCanvas.getInstance()).setFullScreenMode(true);
      var1.tCanvas = this;
      width = var1.c();
      height = var1.b();
      ab = width / 2;
      ac = height / 2;
      y = System.getProperty("microedition.platform").indexOf("RIM") == 0;
      if (MotherCanvas.instance.hasPointerEvents()) {
         isTouch = true;
         if (width >= 240) {
            g = true;
         }

         if (width < 320) {
            h = true;
         }

         if (width >= 320) {
            i = true;
         }
      }

      int var3;
      if ((var3 = RMS.d("indLanguage")) < 0) {
         mResources.e = 0;
      } else {
         mResources.e = var3;
      }

      mResources.a();
      msgdlg = new Class_ey();
      if (height <= 160) {
         Paint.f = 15;
         mScreen.cmdH = 17;
      }
      readMessage = new ReadMessage();
      instance = this;
      System.gc();
      am = new Paint();
      TileMap.j();
      if (!lowGraphic) {
         if (bo == null) {
            bo = new Image[2][5];

            for(var3 = 0; var3 < 2; ++var3) {
               for(int var2 = 0; var2 < 5; ++var2) {
                  bo[var3][var2] = loadImage("/e/d" + var3 + var2 + ".png");
               }
            }
         }

         this.bg = new int[2];
         this.bh = new int[2];
         this.bi = new int[2];
         this.bi[0] = this.bi[1] = -1;
      }

      r();
      bn = loadImage("/u/f.png");
      if (isTouch) {
         for(var3 = 0; var3 < 2; ++var3) {
            ap[var3] = loadImage("/hd/bd" + var3 + ".png");
         }

         aq = mGraphics.getWidth(ap[0]);
         ar = mGraphics.getHeight(ap[0]);
         mGraphics.getWidth(ap[1]);
         mGraphics.getHeight(ap[1]);
      } else if (RMS.d("lowGraphic") == 1) {
         lowGraphic = true;
      }

      SmallImage.c();
      mScreen.ap();
      ah = new Class_es();
   }

   public static GameCanvas b() {
      if (instance == null) {
         instance = new GameCanvas();
      }

      return instance;
   }

   public static void c() {
      Session_ME.getInstance().connect(GameMidlet.IP, GameMidlet.port);
   }

   public static void d() {
      width = MotherCanvas.instance.c();
      height = MotherCanvas.instance.b();
      ab = width / 2;
      ac = height / 2;
      ag = new LoginScr();
      af = new SelectServerScr();
      an = new Class_ez();
      ak = new InputDlg();
      al = new Class_eq();
   }

   public final void a() {
      if (ax > 0) {
         if ((az = System.currentTimeMillis()) - ay >= 1000L) {
            if (--ax == 0) {
               Session_ME.getInstance().d();
            }

            ay = az;
         }
      } else if (Session_ME.getInstance().connected && System.currentTimeMillis() - Session_ME.getInstance().j > 300000L) {
         Session_ME.getInstance().d();
      }

      long var1;
      if ((var1 = System.currentTimeMillis()) - bb >= 780L && !w) {
         bb = var1;
         w = true;
      } else {
         w = false;
      }

      if (var1 - bc >= 7800L && !x) {
         bc = var1;
         x = true;
      } else {
         x = false;
      }

      if (v > 0) {
         --v;
      }

      if (++gameTick > 10000) {
         gameTick = 0;
      }

      if (ad != null) {
         if (currentDialog != null) {
            currentDialog.a();
         } else if (menu.showMenu) {
            menu.b();
            menu.update();
         }

         if (!e) {
            ad.c();
         }

         ad.b();
      }

      long var3 = System.currentTimeMillis();
      if (RMS.k && var3 > RMS.j) {
         RMS.k = false;

         try {
            if (RMS.i > 0) {
               GameScr.getInstance().perform(RMS.i, (Object)null);
            }
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

      InfoDlg.c();
      if (this.bp) {
         this.e();
      }

      MotherCanvas.instance.repaint();
      MotherCanvas.instance.serviceRepaints();
   }

   public final void e() {
      this.bp = false;
      af.update();

      try {
         Char.j();
         GameScr.n();
         GameScr.a();
         setMaxTextLenght();
         InfoDlg.d();
         GameScr.a(true);
         GameScr.i = 100;
         byte var10000 = TileMap.bgID;
         GameScr.vParty.removeAllElements();
         GameScr.vClan.removeAllElements();
         GameScr.aa.removeAllElements();
         GameScr.ad.removeAllElements();
         Char.clan = null;
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public static void f() {
      if (d && --ao < 0) {
         d = false;
      }

   }

   public static void g() {
   }

   public static void paint(mGraphics var0) {
      var0.setColor(0);
      var0.fillRect(0, 0, GameScr.b, GameScr.c);
   }

   public static void h() {
   }

   public static void i() {
   }

   protected final void a(int var1) {
      bf = System.currentTimeMillis();
      if (var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 122 || var1 == 10 || var1 == 8 || var1 == 13 || var1 == 32) {
         at = var1;
      }

      if (currentDialog != null) {
         currentDialog.a(var1);
         at = 0;
      } else {
         ad.a(var1);
         switch (var1) {
            case -39:
            case -2:
               l[8] = true;
               keyPressedz[8] = true;
               return;
            case -38:
            case -1:
               l[2] = true;
               keyPressedz[2] = true;
               return;
            case -22:
            case -7:
               l[13] = true;
               keyPressedz[13] = true;
               return;
            case -21:
            case -6:
               l[12] = true;
               keyPressedz[12] = true;
               return;
            case -5:
            case 10:
               l[5] = true;
               keyPressedz[5] = true;
               return;
            case -4:
               l[6] = true;
               keyPressedz[6] = true;
               return;
            case -3:
               l[4] = true;
               keyPressedz[4] = true;
               return;
            case 35:
               l[11] = true;
               keyPressedz[11] = true;
               return;
            case 42:
               l[10] = true;
               keyPressedz[10] = true;
               return;
            case 48:
               l[0] = true;
               keyPressedz[0] = true;
               return;
            case 49:
               if (ad == GameScr.a && b && !ChatTextField.a().isShow) {
                  l[1] = true;
                  keyPressedz[1] = true;
               }

               return;
            case 50:
               if (ad == GameScr.a && b && !ChatTextField.a().isShow && !GameScr.cd) {
                  l[2] = true;
                  keyPressedz[2] = true;
               }

               return;
            case 51:
               if (ad == GameScr.a && b && !ChatTextField.a().isShow) {
                  l[3] = true;
                  keyPressedz[3] = true;
               }

               return;
            case 52:
               if (ad == GameScr.a && b && !ChatTextField.a().isShow && !GameScr.cd) {
                  l[4] = true;
                  keyPressedz[4] = true;
               }

               return;
            case 53:
               if (ad == GameScr.a && b && !ChatTextField.a().isShow && !GameScr.cd) {
                  l[5] = true;
                  keyPressedz[5] = true;
               }

               return;
            case 54:
               if (ad == GameScr.a && b && !ChatTextField.a().isShow && !GameScr.cd) {
                  l[6] = true;
                  keyPressedz[6] = true;
               }

               return;
            case 55:
               l[7] = true;
               keyPressedz[7] = true;
               return;
            case 56:
               if (ad == GameScr.a && b && !ChatTextField.a().isShow && !GameScr.cd) {
                  l[8] = true;
                  keyPressedz[8] = true;
               }

               return;
            case 57:
               l[9] = true;
               keyPressedz[9] = true;
               return;
            default:
         }
      }
   }

   protected final void b(int var1) {
      at = 0;
      switch (var1) {
         case -39:
         case -2:
            l[8] = false;
            return;
         case -38:
         case -1:
            l[2] = false;
            return;
         case -22:
         case -7:
            l[13] = false;
            ba[13] = true;
            return;
         case -21:
         case -6:
            l[12] = false;
            ba[12] = true;
            return;
         case -5:
         case 10:
            l[5] = false;
            ba[5] = true;
            return;
         case -4:
            l[6] = false;
            return;
         case -3:
            l[4] = false;
            return;
         case 35:
            l[11] = false;
            ba[11] = true;
            return;
         case 42:
            l[10] = false;
            ba[10] = true;
            return;
         case 48:
            l[0] = false;
            ba[0] = true;
            return;
         case 49:
            if (ad == GameScr.a && b && !ChatTextField.a().isShow) {
               l[1] = false;
               ba[1] = true;
            }

            return;
         case 50:
            if (ad == GameScr.a && b && !ChatTextField.a().isShow) {
               l[2] = false;
               ba[2] = true;
            }

            return;
         case 51:
            if (ad == GameScr.a && b && !ChatTextField.a().isShow) {
               l[3] = false;
               ba[3] = true;
            }

            return;
         case 52:
            if (ad == GameScr.a && b && !ChatTextField.a().isShow) {
               l[4] = false;
               ba[4] = true;
            }

            return;
         case 53:
            if (ad == GameScr.a && b && !ChatTextField.a().isShow) {
               l[5] = false;
               ba[5] = true;
            }

            return;
         case 54:
            if (ad == GameScr.a && b && !ChatTextField.a().isShow) {
               l[6] = false;
               ba[6] = true;
            }

            return;
         case 55:
            l[7] = false;
            ba[7] = true;
            return;
         case 56:
            if (ad == GameScr.a && b && !ChatTextField.a().isShow) {
               l[8] = false;
               ba[8] = true;
            }

            return;
         case 57:
            l[9] = false;
            ba[9] = true;
            return;
         default:
      }
   }

   protected final void b(int var1, int var2) {
      if (Class_fa.e(var1 - r) >= 10 || Class_fa.e(var2 - s) >= 10) {
         isPointerClick = false;
      }

      p = var1;
      q = var2;
      if (++bd > 3) {
         bd = 0;
      }

      t[bd] = new Class_df(var1, var2);
   }

   public static boolean j() {
      return System.currentTimeMillis() - bf >= 800L;
   }

   protected final void a(int var1, int var2) {
      m = true;
      isPointerClick = true;
      bf = System.currentTimeMillis();
      r = var1;
      s = var2;
      p = var1;
      q = var2;
   }

   protected final void c(int var1, int var2) {
      m = false;
      isPointerJustRelease = true;
      mScreen.fr = -1;
      p = var1;
      q = var2;
   }

   public static boolean a(int var0, int var1, int var2, int var3) {
      int var4 = p + GameScr.i;
      int var5 = GameScr.j + q;
      return (m || isPointerJustRelease) && var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3;
   }

   public static boolean a(int var0, int var1, int var2, int var3, Scroll var4) {
      int var5 = p + var4.a;
      int var6 = var4.b + q;
      return (m || isPointerJustRelease) && var5 >= var0 && var5 <= var0 + var2 && var6 >= var1 && var6 <= var1 + var3;
   }

   public static boolean b(int var0, int var1, int var2, int var3) {
      return (m || isPointerJustRelease) && p >= var0 && p <= var0 + var2 && q >= var1 && q <= var1 + var3;
   }

   public static void k() {
      for(int var0 = 0; var0 < 14; ++var0) {
         keyPressedz[var0] = false;
      }

      isPointerJustRelease = false;
   }

   public static void l() {
      for(int var0 = 0; var0 < 14; ++var0) {
         l[var0] = false;
      }

   }

   protected final void a(Graphics var1) {
      this.be.graphics = var1;

      try {
         if (ad != null && !e) {
            ad.paint(this.be);
            this.be.setClip(0, 0, width, height);
         }

         this.be.translateXY(-this.be.getTranslateX(), -this.be.getTranslateY());
         this.be.setClip(0, 0, width, height);
         InfoDlg.a(this.be);
         if (currentDialog != null) {
            currentDialog.a(this.be);
         } else if (menu.showMenu) {
            menu.a(this.be);
         }

         GameScr.resetCursor(this.be);
         if (ax > 0) {
            Paint.a(30, height - 118, width - 60, 80, this.be);
            a(ab, height - 98, this.be);
            mFont.tahoma_8b.writeText(this.be, "Xin ch\u1edd " + ax + "s...", ab, height - 78, 2);
            return;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static void setMaxTextLenght() {
      ak.tfInput.setMaxTextLenght(500);
      al.d.setMaxTextLenght(500);
      al.e.setMaxTextLenght(500);
      currentDialog = null;
   }

   public static void setText(String var0) {
      msgdlg.a(var0, (Command)null, new Command(mResources.okey, instance, 8882, (Object)null), (Command)null);
      currentDialog = msgdlg;
   }

   public static void showDialogWait(String var0) {
      msgdlg.a(var0, (Command)null, new Command(mResources.huy, instance, 8882, (Object)null), (Command)null);
      currentDialog = msgdlg;
      msgdlg.d = true;
   }

   public static void pleaseWait() {
      showDialogWait(mResources.textLoading);
   }

   public static void o() {
      msgdlg.e = 500;
      msgdlg.a(mResources.textLoading, (Command)null, (Command)null, (Command)null);
      currentDialog = msgdlg;
      msgdlg.d = true;
   }

   public final void a(String var1, String var2, String var3, String var4) {
      msgdlg.a(var4, new Command(var1, this, 8881, var3), (Command)null, new Command(var2, this, 8882, (Object)null));
      currentDialog = msgdlg;
   }

   public final void a(String var1, String var2, short var3, String var4, String var5) {
      MyVector var6;
      (var6 = new MyVector()).addElement(new Short(var3));
      var6.addElement(var4);
      msgdlg.a(var5, new Command(var1, this, 8883, var6), (Command)null, new Command(var2, this, 8882, (Object)null));
      currentDialog = msgdlg;
   }

   public static void a(String var0, int var1) {
      msgdlg.a(var0, (Command)null, new Command(mResources.okey, instance, var1, (Object)null, width / 2 - 35, height - 50), (Command)null);
      currentDialog = msgdlg;
   }

   public static void a(String var0, int var1, Object var2, int var3, Object var4) {
      msgdlg.a(var0, new Command(mResources.bn, instance, var1, var2), new Command("", instance, var1, var2), new Command(mResources.ca, instance, var3, var4));
      currentDialog = msgdlg;
   }

   public static void a(String var0, Command var1, Command var2) {
      msgdlg.a(var0, var1, (Command)null, var2);
      currentDialog = msgdlg;
   }

   public static Image loadImage(String var0) {
      var0 = "/x" + mGraphics.zoomLevel + var0;
      Image var1 = null;

      try {
         var1 = Image.createImage(var0);
      } catch (IOException var2) {
      }

      return var1;
   }

   public final boolean a(int var1, int var2, int var3) {
      if (lowGraphic) {
         return false;
      } else {
         var1 = var1 == 1 ? 0 : 1;
         if (this.bi[var1] != -1) {
            return false;
         } else {
            this.bi[var1] = 0;
            this.bg[var1] = var2;
            this.bh[var1] = var3;
            return true;
         }
      }
   }

   private static void r() {
      if (!lowGraphic) {
         bm = new Image[3];

         for(int var0 = 0; var0 < 3; ++var0) {
            bm[var0] = loadImage("/e/w" + var0 + ".png");
         }

         bj = new int[2];
         bk = new int[2];
         (bl = new int[2])[0] = bl[1] = -1;
      }

   }

   public static boolean d(int var0, int var1) {
      if (lowGraphic) {
         return false;
      } else {
         int var2 = bl[0] == -1 ? 0 : 1;
         if (bl[var2] != -1) {
            return false;
         } else {
            bl[var2] = 0;
            bj[var2] = var0;
            bk[var2] = var1;
            return true;
         }
      }
   }

   public final void p() {
      if (!lowGraphic) {
         for(int var1 = 0; var1 < 2; ++var1) {
            if (this.bi[var1] != -1) {
               int var10002 = this.bi[var1]++;
               if (this.bi[var1] >= 5) {
                  this.bi[var1] = -1;
               }

               if (var1 == 0) {
                  var10002 = this.bg[var1]--;
               } else {
                  var10002 = this.bg[var1]++;
               }

               var10002 = this.bh[var1]--;
            }
         }
      }

   }

   public static boolean e(int var0, int var1) {
      return var0 >= GameScr.i && var0 <= GameScr.i + GameScr.b && var1 >= GameScr.j && var1 <= GameScr.j + GameScr.c + 30;
   }

   public final void b(mGraphics var1) {
      if (!lowGraphic) {
         for(int var2 = 0; var2 < 2; ++var2) {
            if (this.bi[var2] != -1 && e(this.bg[var2], this.bh[var2])) {
               var1.drawImage(bo[var2][this.bi[var2]], this.bg[var2], this.bh[var2], 3);
            }
         }
      }

   }

   public static void a(int var0, int var1, mGraphics var2) {
      int var3 = gameTick % 3;
      var2.drawRegion(bn, 0, var3 << 4, 16, 16, 0, var0, var1, 3);
   }

   public final void q() {
      e = false;
      this.bp = true;
   }

   public static boolean c(int var0, int var1, int var2, int var3) {
      return (m || isPointerJustRelease) && p >= var0 && p <= var0 + var2 && q >= var1 && q <= var1 + var3;
   }

   public final void perform(int var1, Object var2) {
      String inputText;
      Item[] var19;
      int var4;
      String var12;
      short var13;
      Char var14;
      int var15;
      switch (var1) {
         case 1608:
            Service.getInstance().a(al.d.getText(), al.e.getText(), (byte)0);
            setMaxTextLenght();
            return;
         case 1700:
            Service.getInstance().a((short)100, ak.tfInput.getText(), GameScr.fe);
            setMaxTextLenght();
            return;
         case 8881:
            NinjaUtil.b((String)var2);
            currentDialog = null;
            return;
         case 8882:
            currentDialog = null;
            return;
         case 8883:
            var13 = ((Short)((MyVector)var2).elementAt(0)).shortValue();
            NinjaUtil.a((String)((MyVector)var2).elementAt(0), var13);
            currentDialog = null;
            return;
         case 8884:
            setMaxTextLenght();
            af.update();
            return;
         case 8885:
            GameMidlet.instance.notifyDestroyed();
            return;
         case 8887:
            setMaxTextLenght();
            var1 = ((Integer)var2).intValue();
            Service.getInstance().t(var1);
            return;
         case 8888:
            var1 = ((Integer)var2).intValue();
            Service.getInstance().u(var1);
            setMaxTextLenght();
            return;
         case 8889:
            var12 = (String)var2;
            setMaxTextLenght();
            Service.getInstance().i(var12);
            return;
         case 8890:
            setMaxTextLenght();
            Service.getInstance().o(((Integer)var2).intValue());
            return;
         case 16081:
            Service.getInstance().a(al.d.getText(), al.e.getText(), (byte)1);
            setMaxTextLenght();
            return;
         case 88810:
            var1 = ((Integer)var2).intValue();
            setMaxTextLenght();
            Service.getInstance().l(var1);
            return;
         case 88811:
            setMaxTextLenght();
            Service.getInstance().h();
            return;
         case 88812:
            var14 = (Char)var2;
            setMaxTextLenght();
            Service.getInstance().p(var14.charID);
            return;
         case 88813:
            setMaxTextLenght();
            var19 = (Item[])var2;
            Service.getInstance().crystalCollect(var19);
            return;
         case 88814:
            var19 = (Item[])var2;
            setMaxTextLenght();
            Service.getInstance().crystalCollectLock(var19);
            return;
         case 88815:
            GameScr.getInstance();
            GameScr.af();
            return;
         case 88816:
            Service.getInstance().b(al.d.getText(), al.e.getText());
            setMaxTextLenght();
            return;
         case 88817:
            if (Char.getMyChar().npcFocus != null) {
               Service.getInstance().menu(Char.getMyChar().npcFocus.template.npcTemplateId, menu.menuSelectedItem, 0);
               return;
            }

            Service.getInstance().menu(0, menu.menuSelectedItem, 0);
            return;
         case 88818:
            var13 = ((Short)var2).shortValue();
            Service.getInstance().a(var13, ak.tfInput.getText());
            setMaxTextLenght();
            return;
         case 88819:
            var13 = ((Short)var2).shortValue();
            Service.getInstance().a(var13);
            GameScr.getInstance().closeDialog();
            return;
         case 88820:
            String[] var18 = (String[])var2;
            if (Char.getMyChar().npcFocus == null) {
               return;
            }

            Integer var17 = new Integer(menu.menuSelectedItem);
            if (var18.length <= 1) {
               ChatPopup.chat("", 1, Char.getMyChar().npcFocus);
               Service.getInstance().menu(Char.getMyChar().npcFocus.template.npcTemplateId, var17.intValue(), 0);
               return;
            }

            MyVector var3 = new MyVector();

            for(var4 = 0; var4 < var18.length - 1; ++var4) {
               var3.addElement(new Command(var18[var4 + 1], instance, 88821, var17));
            }

            menu.showMenu(var3);
            return;
         case 88821:
            var4 = ((Integer)var2).intValue();
            ChatPopup.chat("", 1, Char.getMyChar().npcFocus);
            Service.getInstance().menu(Char.getMyChar().npcFocus.template.npcTemplateId, var4, menu.menuSelectedItem);
            return;
         case 88822:
            ChatPopup.chat("", 1, Char.getMyChar().npcFocus);
            Service.getInstance().menu(Char.getMyChar().npcFocus.template.npcTemplateId, menu.menuSelectedItem, 0);
            return;
         case 88823:
            setText(mResources.ez);
            return;
         case 88824:
            setText(mResources.fa);
            return;
         case 88825:
            setText(mResources.py);
            return;
         case 88826:
            setText(mResources.qa);
            return;
         case 88827:
            setText(mResources.pz);
            return;
         case 88828:
            setText(mResources.qb);
            return;
         case 88829:
            if ((var12 = ak.tfInput.getText()).equals("")) {
               return;
            }

            Service.getInstance().a(var12, ((Integer)var2).intValue());
            showDialogWait(mResources.textLoading);
            return;
         case 88830:
            var1 = ((Integer)var2).intValue();
            setMaxTextLenght();
            Service.getInstance().ag(var1);
            return;
         case 88831:
            var1 = ((Integer)var2).intValue();
            setMaxTextLenght();
            Service.getInstance().ah(var1);
            return;
         case 88832:
            var12 = ak.tfInput.getText();
            setMaxTextLenght();
            if (!var12.equals("")) {
               Service.getInstance().o(var12);
               return;
            }
            break;
         case 88833:
            var12 = ak.tfInput.getText();
            setMaxTextLenght();
            if (!var12.equals("")) {
               try {
                  var1 = Integer.parseInt(var12);
                  if (Char.getMyChar().xu >= var1 && var1 >= 0) {
                     Service.getInstance().ai(var1);
                     return;
                  }

                  InfoMe.a(mResources.qc, 20, mFont.tahoma_7_yellow);
                  return;
               } catch (Exception var11) {
                  return;
               }
            }
            break;
         case 88834:
            var12 = ak.tfInput.getText();
            setMaxTextLenght();
            if (!var12.equals("")) {
               try {
                  if ((var1 = Integer.parseInt(var12)) <= 0) {
                     return;
                  }

                  Service.getInstance().aj(var1);
                  return;
               } catch (Exception var10) {
                  return;
               }
            }
            break;
         case 88835:
            var1 = Integer.parseInt((String)var2);
            var15 = Integer.parseInt(ak.tfInput.getText());
            currentDialog = null;
            if (var15 > 0 && var15 < Char.getMyChar().arrItemBag[var1].quantity) {
               Service.getInstance().k(var1, var15);
               return;
            }

            setText(mResources.qd);
            return;
         case 88836:
            ak.tfInput.setMaxTextLenght(6);
            ak.a(mResources.pc, new Command(mResources.di, instance, 888361, (Object)null), 1);
            return;
         case 88837:
            var12 = ak.tfInput.getText();
            setMaxTextLenght();

            try {
               Service.getInstance().am(Integer.parseInt(var12.trim()));
               return;
            } catch (Exception var9) {
               return;
            }
         case 88838:
            var12 = al.d.getText().trim();
            inputText = al.e.getText().trim();
            setMaxTextLenght();
            if (var12.length() >= 6 && inputText.length() >= 6) {
               try {
                  var1 = Integer.parseInt(var12);
                  var15 = Integer.parseInt(inputText);
                  if (var1 >= 99999 && var15 >= 99999) {
                     Service.getInstance().l(var1, var15);
                     return;
                  }

                  setText(mResources.oy);
                  return;
               } catch (Exception var8) {
                  setText(mResources.ox);
                  return;
               }
            }

            setText(mResources.ow);
            return;
         case 88839:
            var12 = ak.tfInput.getText();
            setMaxTextLenght();

            try {
               Integer.parseInt(var12);
               a(mResources.qf, 888391, var12, 8882, (Object)null);
               return;
            } catch (Exception var7) {
               InfoMe.a(mResources.oz, 20, mFont.tahoma_7_yellow);
               return;
            }
         case 88840:
            var14 = (Char)var2;
            setMaxTextLenght();
            Service.getInstance().m(var14.charID);
            return;
         case 88841:
            var14 = (Char)var2;
            setMaxTextLenght();
            Service.getInstance().n(var14.charID);
            return;
         case 88842:
            Service.getInstance().ac();
            return;
         case 88843:
            inputText = ak.tfInput.getText();
            setMaxTextLenght();
            if (inputText.equals("")) {
               setText(mResources.qe);
               return;
            }

            Service.getInstance().sendClanItem(inputText);
            return;
         case 888181:
            var13 = ((Short) var2).shortValue();
            Service.getInstance().b(var13, ak.tfInput.getText());
            setMaxTextLenght();
            return;
         case 888361:
            var12 = ak.tfInput.getText();
            setMaxTextLenght();
            if (var12.length() >= 6 && !var12.equals("")) {
               try {
                  Service.getInstance().ak(Integer.parseInt(var12));
                  return;
               } catch (Exception var6) {
                  setText(mResources.ox);
                  return;
               }
            }

            setText(mResources.ow);
            return;
         case 888391:
            try {
               setMaxTextLenght();
               var15 = Integer.parseInt((String)var2);
               Service.getInstance().al(var15);
               return;
            } catch (Exception var5) {
               return;
            }
      }

   }
}

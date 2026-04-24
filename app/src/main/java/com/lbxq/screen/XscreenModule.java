package com.lbxq.screen;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class XscreenModule implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {
        try {
            String pkg = lpparam.packageName;
            // 只匹配微信、支付宝
            if ("com.tencent.mm".equals(pkg)
                    || "com.eg.android.AlipayGphone".equals(pkg)) {
                // 完全空逻辑，不写任何日志、不Hook
            }
        } catch (Throwable ignored) {
            // 静默捕获所有异常，绝不闪退、不崩LSP
        }
    }
}

package org.keyListern;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class setClipboardString {
    public static void setClipboardString(String text) {
//  获取系统粘贴板
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//  封装文本内容
        Transferable transferable = new StringSelection(text);
//  把文本内容设置到粘贴板
        clipboard.setContents(transferable, null);
    }
}

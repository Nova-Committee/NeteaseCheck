package committee.nova.neteasecheck;

@SuppressWarnings("unused")
public class NeteaseCheck {
    public static void check() {
        try {
            Class.forName("com.netease.mc.mod.network.common.Library");
            throw new PlatformNotAuthorizedError();
        } catch (ClassNotFoundException ignored) {
        }
    }

    public static class PlatformNotAuthorizedError extends Error {
        public PlatformNotAuthorizedError() {
            super("此版本不支持在网易MC客户端运行——请尝试在组件中心下载兼容的版本。");
        }
    }
}

package lsp;

public abstract class SocialMedia {
    //support whatsapp, facebook, instagram
    public abstract void chatWithFriend();

    //support facebook, instagram
    public abstract void publishPost(Object post);

    //support whatsapp, facebook, instagram
    public abstract void sendPhotoAndVideos();

    //support whatsapp, facebook
    public abstract void groupVideoCall();
}

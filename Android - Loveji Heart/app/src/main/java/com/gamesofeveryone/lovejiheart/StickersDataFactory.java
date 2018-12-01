package com.gamesofeveryone.lovejiheart;

import java.util.ArrayList;
import java.util.List;

public class StickersDataFactory {

    public static List<Sticker> getAllStickerReference() {
        String[] stickerURLRef = {

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-0.png?alt=media&token=6325e2a2-0640-4f5f-803f-5afc6bc9a41c",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-01.png?alt=media&token=ffc220b1-6260-4ccd-8a7c-1e9431396f1c",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-02.png?alt=media&token=b6cae751-9de0-4cef-9761-bea45914ecef",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-03.png?alt=media&token=0dd3abd4-523b-4d46-b3d5-1495854ea821",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-04.png?alt=media&token=417d0b79-bca3-4974-94d1-251b76158bee",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-05.png?alt=media&token=b0043759-142a-49c9-a407-c9128298ba9c",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-06.png?alt=media&token=4a42fff4-d38f-4742-b17c-cc6e3b719b0c",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-07.png?alt=media&token=f99f4429-9ced-4037-b55d-2a3a4ac0ad4e",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-08.png?alt=media&token=93de8619-34e8-46c6-91b8-4fc68edffa8f",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-09.png?alt=media&token=3f74beaf-da8f-467a-840a-8fd340023a43",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-10.png?alt=media&token=c3cb1bf0-152f-4b3a-93db-7e3474642ae0",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-11.png?alt=media&token=969d8e8e-eadd-4e9e-9cd8-0996ed9ecf33",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejhearts-12.png?alt=media&token=549fbca5-75d4-4772-b8b0-5830432e2d32"
        };
        List<Sticker> stickerList = new ArrayList<>();
        for (int i = 0; i < stickerURLRef.length; i++) {
            stickerList.add(new Sticker(stickerURLRef[i]));
        }
        return stickerList;
    }
}
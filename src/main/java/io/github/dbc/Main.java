package io.github.dbc;

import io.github.dbc.service.MusicPlayerService;

public class Main {
    public static void main(String[] args) {
        MusicPlayerService musicPlayerService = new MusicPlayerService();
        musicPlayerService.play("src/main/resources/songs/akatsuki-theme.wav");
    }
}
package com.annhienktuit.exoplayervideoplayerzalo.adapters

import android.app.PendingIntent
import android.content.Context
import android.graphics.Bitmap
import android.support.v4.media.session.MediaControllerCompat
import com.annhienktuit.exoplayervideoplayerzalo.R
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.ui.PlayerNotificationManager.BitmapCallback
import com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
import android.graphics.drawable.BitmapDrawable

import androidx.annotation.DrawableRes
import com.annhienktuit.exoplayervideoplayerzalo.utils.Extensions.getBitmapFromResource


class DescriptionAdapter(val context:Context, private val controller: MediaControllerCompat) : MediaDescriptionAdapter {
    private var mContext:Context = context
    override fun getCurrentContentTitle(player: Player): String {
        val window = player.currentWindowIndex
        return window.toString()
    }

    override fun createCurrentContentIntent(player: Player): PendingIntent? =
        controller.sessionActivity

    override fun getCurrentContentText(player: Player): String? {
        return null
    }

    override fun getCurrentLargeIcon(player: Player, callback: BitmapCallback): Bitmap? {
        return getBitmapFromResource(mContext, R.drawable.logo)
    }

}
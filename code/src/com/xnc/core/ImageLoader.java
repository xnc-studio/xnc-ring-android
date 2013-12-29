package com.xnc.core;

import android.widget.ImageView;

public abstract interface ImageLoader
{
  public abstract void loadImage(ImageView paramImageView, String paramString);

  public abstract void loadImage(ImgHandler paramImgHandler, ImageRequest paramImageRequest);

  public abstract void loadImage(ImgHandler paramImgHandler, String paramString);
}
package com.xnc.core;

import android.graphics.Bitmap;

public abstract interface ImgHandler
{
  public abstract void handleBitmap(Bitmap paramBitmap, ImageRequest paramImageRequest);

  public abstract void handleUnableToFetchBitmap(ImageRequest paramImageRequest);

  public abstract void imageLoadInitiated(ImageRequest paramImageRequest);
}
package com.xnc.core;

public class ImageRequest
{
  private static int masterIdx = 0;
  private boolean canceled;
  private int height = -1;
  private int idx;
  private ImgHandler imgHandler;
  private String imgUrl;
  private int width = -1;

  public ImageRequest(ImgHandler paramImgHandler, String paramString)
  {
    masterIdx += 1;
    int i = masterIdx;
    this.idx = i;
    this.canceled = false;
    this.imgHandler = paramImgHandler;
    this.imgUrl = paramString;
  }

  /** @deprecated */
  public static ImageRequest constructRequest(ImgHandler paramImgHandler, String paramString)
  {
    try
    {
      ImageRequest localImageRequest = new ImageRequest(paramImgHandler, paramString);
      return localImageRequest;
    }
    finally
    {
      
    }
  }

  public void cancelRequest()
  {
    this.canceled = true;
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (this == paramObject);
    return true;
  }

  public String getImagePath()
  {
    return this.imgUrl;
  }

  public String getImageUrl(String paramString)
  {
    String str1 = this.imgUrl;
    if (this.imgUrl.contains("graphics"))
    {
      String str2 = String.valueOf(paramString);
      StringBuilder localStringBuilder1 = new StringBuilder(str2);
      String str3 = this.imgUrl;
      str1 = str3;
    }
    return str1;
  }

  public ImgHandler getImgHandler()
  {
    return this.imgHandler;
  }

  public int hashCode()
  {
    int i = (this.idx + 31) * 31;
    if (this.imgUrl == null);
    for (int j = 0; ; j = this.imgUrl.hashCode())
      return i + j;
  }

  public boolean isCanceled()
  {
    return this.canceled;
  }
}
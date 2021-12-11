public class Resource
{
  private String fileName;
  private String extension;

  public Resource(String fileName, String extension)
  {
    this.fileName = fileName;
    this.extension = extension;
  }

  public boolean isPDF()
  {
    return extension.equals("pdf");
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Resource))
    {
      return false;
    }
    Resource other = (Resource) obj;
    return fileName.equals(other.fileName) && extension.equals(other.extension);
  }

  public String toString()
  {
    return "The file name is " + fileName + ", and the extension is "
        + extension;
  }
}

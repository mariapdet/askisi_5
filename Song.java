public class Song{

	private String title;
	private String url;
	private Singer singer;

	static Song[] son = new Song [10];
	static int count=0;

	public Song (String title1, Singer singer1, String url1){
		this.title = title1;
		this.url = url1;
		this.singer = singer1;
		son[count]=this;
		count=count+1;
	}

	public String getTitle(){
		return title;
	}

	public String getUrl(){
		return url;
	}

	public Singer getSinger(){
		return singer;
	}

	public void setTitle(String title2){
		this.title = title2;
	}

	public void setUrl(String url2){
		this.url = url2;
	}

	public void setSinger(Singer singer2){
		this.singer = singer2;
	}

	public String toString(){
		return "Titlos: " + title + "Url: " + url + "Singer: " + singer ;
	}
	}
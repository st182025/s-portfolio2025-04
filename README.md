☆s-portfolio（ラーメンギャラリーWebアプリ）

・概要 これは Spring Boot を使って開発した、日本の地方ごとのラーメンのギャラリーを表示するWebアプリです。
ナビバーで画面遷移し、ギャラリーで写真やスクロールメッセージなどが見られます。


・使用技術

Java（Spring Boot）、

HTML / CSS、

Oracle SQL（DB接続あり）


・画面イメージ トップページ、関東ページのスクリーンショット

![トップページのスクリーンショット](./ramen/screenshot.png)

![関東のスクリーンショット](./ramen/screenshot2.png)


・起動方法（ローカル実行）

このプロジェクトは Eclipse（Spring Tools）環境での実行を前提としています。


・手順要項：

本リポジトリを clone または zip ダウンロード

Eclipse で ramen プロジェクトをインポート（Mavenプロジェクトとして）

src/main/resources/application.properties にてDB接続等の設定を行う

RamenApplication.java を右クリック → 「Spring Boot アプリケーションとして実行」

http://localhost:8080 にアクセスして動作確認


☆セットアップ手順（ローカル環境） 

このアプリは Java（Spring Boot）で構築されており、ローカル環境で起動・画面確認ができます。
以下の手順に従っていただければ、どなたでも画面遷移を確認できます。


・前提条件（インストールが必要なもの）

Java 17 以上
Eclipse（Spring Tools または Pleiades版推奨）
Oracle Database（例：Oracle XE）
Oracle JDBCドライバ（ojdbc8.jar など）

・当リポジトリをクローン GitHubのこのリポジトリをクローン、またはZIPでダウンロードしてください。 GitBashにて以下を入力。

git clone https://github.com/sbt18hurang/s-portfolio.git


・Eclipseでプロジェクトを読み込む

-Eclipseを起動
-「ファイル」→「インポート」→「既存の Maven プロジェクト」
-フォルダ s-portfolio/ramen を選択
-プロジェクトが読み込まれたらビルド完了を待つ

・Oracle DBの設定を確認
src/main/resources/application.properties に、以下のようにDB接続情報を記述します。

spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XEPDB1
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.database-platform=org.hibernate.dialect.Oracle12cDialect
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

・アプリを実行する

RamenApplication.java を右クリック

「Spring Boot アプリケーションとして実行」を選択

コンソールに Started RamenApplication と出れば成功。


・ ブラウザで画面を確認


以下のURLにアクセス：

http://localhost:8080/ramen/




☆画面遷移無し、画面表示のみのサンプル

・ホーム画面

https://st182025.github.io/s-portfolio2025-04/html/home.html

・北海道

https://st182025.github.io/s-portfolio2025-04/html/hokkaido.html

・東北

https://st182025.github.io/s-portfolio2025-04/html/tohoku.html

・中部

https://st182025.github.io/s-portfolio2025-04/html/chubu.html


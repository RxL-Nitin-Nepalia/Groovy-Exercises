new File( 'Desktop/newfile.txt' ).withWriter { w ->
  ['Desktop/new1.txt', 'Desktop/interview.txt', 'Desktop/new.txt'].each { f ->
    new File( f ).withReader { r ->
      w << r << '\n'
    }
  }
}
String readFileString() {
    File file = new File("Desktop/newfile.txt")
    File file2 = new File("Desktop/out.txt")
    String fileContent = file.text
    fileContent = fileContent*.trim().join('')
    file2.write fileContent
}
readFileString()
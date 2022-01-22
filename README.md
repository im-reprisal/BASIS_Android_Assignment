# BASIS_Android_Assignment
# Click On Demo
  <code>
    <a href="https://drive.google.com/file/d/1dtjY2-Gt3xw83YulbkJJtjX-9ACxQwHY/view?usp=sharing" title="Playstore Profile"><img height="140" width="140" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgwJcz642pA7mLR5u44OirKSJjfxOoOqWbpNx7vgDP0NI4snSp68daLp-JccwzoGUIARw&usqp=CAU"></a></code>

# Things we used while making this application
* MVVM
* Recycler View
* Retrofit Library
* Glide

# Dependencies 
    //General Dependencies
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    implementation 'androidx.navigation:navigation-fragment-ktx:2.3.5'
    implementation 'androidx.navigation:navigation-ui-ktx:2.3.5'
    def anko_version = '0.10.0'
    def arch_version = '2.2.0-alpha01'

    implementation 'androidx.core:core-ktx:1.6.0'
    implementation 'androidx.appcompat:appcompat:1.3.1'
    implementation 'com.google.android.material:material:1.3.0-alpha02'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.0'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

    //Anko
    implementation "org.jetbrains.anko:anko-commons:$anko_version"

    // material UI
    implementation 'com.google.android.material:material:1.5.0-alpha03'
    
    // Import the Firebase BoM
    implementation platform('com.google.firebase:firebase-bom:28.4.0')

    implementation 'androidx.multidex:multidex:2.0.1'

    // glide 
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
    
    // Retrofit dependency which will be used to make network calls
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    
    // GSON library which is used to convert POJO to JSON and vice versa
    implementation 'com.squareup.retrofit2:converter-gson:2.6.2'
    
    // okhttp library used to observe the api call logs on LogCat
    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.0'

  

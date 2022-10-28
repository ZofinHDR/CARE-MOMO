class Resident{

    constructor(name,birthday, gender, religion,
                sexuality, hobby, nickname,nationality, lastJob,  social, transparency, functionality ) {
            this.name = name;
            this.birthday = birthday;
            this.gender = gender;
            this.religion = religion;
            this.sexuality = sexuality;
            this.hobby = hobby;
            this.nickname = nickname;
            this.nationality = nationality;
            this.lastJob = lastJob;
            this.social = social;
            this.transparency = transparency;
            this.functionality = functionality;
    }

}


/*
Java Class:
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "DATE")
    private LocalDate birthday;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private Religion religion;
    @Enumerated(EnumType.STRING)
    private Sexuality sexuality;
    private String hobby;
    private String nickname;
    private String nationality;
    private String lastJob;
    @OneToOne(cascade = CascadeType.ALL)
    private Social social;
    @OneToOne(cascade = CascadeType.ALL)
    private Transparency transparency;
    @OneToOne(cascade = CascadeType.ALL)
    private Functionality functionality;

 */
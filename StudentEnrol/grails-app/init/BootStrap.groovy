import com.studentenrol.*
class BootStrap {

    def init = { servletContext ->
def course1= new Course( title: 'Interactive Media with Animation',
department: 'Computing',
description: ''' Lorem ipsum dolor sit amet, ad sea solum
brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',
leader: 'Joe Jojo',
code: 'IMA101',
startDate: new Date('19/01/2015'),
endDate: new Date('19/01/2020')).save()

def course2= new Course( title: 'Web Design',
department: 'Computing',
description: ''' Lorem ipsum dolor sit amet, ad sea solum
brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',
leader: 'Sam Adams',
code: 'SAM101',
startDate: new Date('19/01/2016'),
endDate: new Date('19/01/2022')).save()

def student1 =new Student( name: 'Sam Adams', studentid: '302304', dob: new Date('20/01/1995'), email: 'samadams@live.co.uk', username:'samiscool', password:'samisntcool', course: 'Web Design').save()

def student2 =new Student( name: 'bob geldolf', studentid: '309804', dob: new Date('20/01/1997'), email: 'bobgeldolfs@live.co.uk', username:'bobiscool', password:'bobisntcool', course: 'Web Design').save()
    }
    def destroy = {
    }
}


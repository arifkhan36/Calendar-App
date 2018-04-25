import React, { Component } from 'react';

class Month extends Component {
    //  constructor(props){
    //      super(props);

         
    //  }
     state = {
    //      today:
    //      showmonth:
    //      showyear:
        datecontext: [
            { date: 1, notes: "" },
            { date: 2, notes: "" },
            { date: 3, notes: "" },
            { date: 4, notes: "" },
            { date: 5, notes: "" },
            { date: 6, notes: "" },
            { date: 7, notes: "" },
            { date: 8, notes: "" },
            { date: 9, notes: "" },
            { date: 10, notes: "" },
            { date: 11, notes: "" },
            { date: 12, notes: "" },
            { date: 13, notes: "" },
            { date: 14, notes: "a" },
            { date: 15, notes: "" },
            { date: 16, notes: "" },
            { date: 17, notes: "b" },
            { date: 18, notes: "" },
            { date: 19, notes: "s" },
            { date: 20, notes: "" },
            { date: 21, notes: "" },
            { date: 22, notes: "" },
            { date: 23, notes: "" },
            { date: 24, notes: "" },
            { date: 25, notes: "" },
            { date: 26, notes: "" },
            { date: 27, notes: "" },
            { date: 28, notes: "" },
            { date: 29, notes: "" },
            { date: 30, notes: "" },
            { date: 31, notes: "" }
          ],

      };

     weekdays = ['sunday','monday','tuesday','wednesday','thrusday','friday'];
     weekdaysShort = ['sun','mon','tue','wed','thur','fri','sat'];
     month = ['jan','feb','mar','apr','may'];

    //  firstDayOfMonth = () => {
    //      let datecontext = this.state.datecontext;
    //      let firstDay = (datecontext).startOf('month').format('d');
    //      return firstDay;
    //  }

    render() { 
        let weekdays = this.weekdaysShort.map((day,value) => {
            return(
                <td key={value}>{day}</td>
            )
        });

        let blanks = [];
        for (let i = 0; i<this.datecontext;i++){
            blanks.push(<td>{""}
                       </td>
                );
        }
        console.log(blanks);

        return ( 
            <div>
              <table>
                  <thead>
                      <tr>
                      </tr>
                    </thead>
                    <tbody>
                        {weekdays}
                    </tbody>

              </table>
            </div>
         )
    }
}
 
export default Month;